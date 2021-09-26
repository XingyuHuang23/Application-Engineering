package com.hxy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Visibility extends JFrame {
    private final static int WIDTH = 150;
    private final static int HEIGHT = 200;

    public Visibility(String title, List<String> attris, List<String> txtField, HashMap<String, String> imgs, Date date){
        this.setTitle(title);
        setLayout(null);
        this.setLocation(200, 100);
        JPanel Cpan1 = new JPanel();
        Cpan1.setLayout(new GridLayout(attris.size()+1, 2));
        //Cpan1.setLayout(new FlowLayout());
//        Cpan1.setSize(750,80);

        Cpan1.setBounds(100, 120, 500, 600);
        JLabel l = new JLabel();
        JLabel lB = new JLabel();
        ImageIcon photoIcon = null;
        ImageIcon bioIcon = null;

        if(imgs.get("photo")==null && imgs.get("bio")==null){
            photoIcon = new ImageIcon("./src/main/java/com/hxy/photo/default.png");
            bioIcon = new ImageIcon("./src/main/java/com/hxy/biometric/default.png");
        }else{
            photoIcon = new ImageIcon("./src/main/java/com/hxy/photo/"+imgs.get("photo"));
            bioIcon = new ImageIcon("./src/main/java/com/hxy/biometric/"+imgs.get("bio"));
        }

        Image img = photoIcon.getImage();
        img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        photoIcon.setImage(img);
        l.setIcon(photoIcon);

        Image imgB = bioIcon.getImage();
        imgB = imgB.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        bioIcon.setImage(imgB);
        lB.setIcon(bioIcon);

        //label的大小设置为ImageIcon,否则显示不完整
        l.setBounds(150, 20, photoIcon.getIconWidth(), photoIcon.getIconHeight());
        lB.setBounds(500, 20, bioIcon.getIconWidth(), bioIcon.getIconHeight());

        for(int i = 0;i<attris.size();i++){
            Cpan1.add(new JLabel("                "+attris.get(i)+"： "));
            Cpan1.add(new JLabel(txtField.get(i)));
        }

        SimpleDateFormat sdf =new SimpleDateFormat("MM /dd /yyyy" );

        Cpan1.add(new JLabel("                BirthDay： "));
        Cpan1.add(new JLabel(sdf.format(date)));
        this.add(l);
        this.add(lB);

        this.add(Cpan1);
        //this.dispose();
        this.setSize(750,850);
        this.setResizable(false);
        this.setVisible(true);
    }


}
