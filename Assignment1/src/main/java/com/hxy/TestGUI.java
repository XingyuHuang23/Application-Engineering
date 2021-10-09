package com.hxy;

import org.jdesktop.swingx.JXDatePicker;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.List;


import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class TestGUI {
    public static void main(String[] args) {

       final JFrame f = new JFrame("Student Information Input");
        f.setSize(745, 350);
        f.setLocation(200, 200);

        f.setLayout(null);

        final JPanel pLeft = new JPanel();
        pLeft.setBounds(50, 50, 300, 60);

        pLeft.setBackground(Color.LIGHT_GRAY);

        pLeft.setLayout(new FlowLayout());

        JButton b1 = new JButton("Create");
        JButton b2 = new JButton("View");


        b1.setPreferredSize(new Dimension(72, 30));
        b2.setPreferredSize(new Dimension(72, 30));

       final List<String> attris = Arrays.asList("Name", "Address","NUID","Social Security number","Medical record number","Health plan beneficiary number",
                "Bank account numbers","Certificate/license number","Car NO",
                "Device identifiers numbers","LinkedIn","Internet protocol addresses");

        JButton bIn;
        pLeft.add(b1);
        pLeft.add(b2);

        final  JPanel pRight_top = new JPanel();
        pRight_top.setLayout(new BorderLayout());



        final  JPanel pRight_create = new JPanel();


        pRight_create.setLayout(new GridLayout(attris.size(), 2));

        pRight_create.setBounds(10, 150, 200, 600);

        final  JPanel pRight_center = new JPanel();
        pRight_center.setLayout(new FlowLayout());
        pRight_center.setBounds(10, 150, 200, 300);


        final HashMap<String,JTextField> jpanel_map = new HashMap<String, JTextField>();

        for(String attri:attris){
            pRight_create.add(new JLabel("      "+attri+"： "));
            JTextField t =  new JTextField(8);

            jpanel_map.put(attri,t);
            pRight_create.add(t);
    }
        final HashMap<String,String> imgs = new HashMap<String, String>();
        JButton photo = new JButton("upload photo");
        final JFileChooser choose = new JFileChooser();
        photo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {




                choose.setMultiSelectionEnabled(false);

                choose.setFileFilter(new FileFilter() {
                    public String getDescription() {
                        return ".jpg" ;
                    }
                    public boolean accept(File f) {
                        return f.getName().toLowerCase().endsWith(".jpg") || f.getName().toLowerCase().endsWith(".png")  ;
                    }
                });

                int returnVar = choose.showOpenDialog(pRight_center);

                if(returnVar == choose.APPROVE_OPTION){
                    //得到选择的文件
                    File f = choose.getSelectedFile();

                    String fileName =f.getName();
                    imgs.put("photo",f.getName());

                    String prefix=fileName.substring(fileName.lastIndexOf(".")+1);

                    if(!(prefix.equals("jpg") || prefix.equals("png"))){
                        JOptionPane.showMessageDialog(new JDialog(),":please select.jpg or .png format");
                        return;
                    }

                    String path = "./src/main/java/com/hxy/photo";

                    File dir = new File(path);
                    if(!dir.exists()){
                        dir.mkdirs();
                    }

                    File[] fs = dir.listFiles();

                    HashSet<String> set = new HashSet<String>();

                    for(File a : fs){
                        set.add(a.getName());
                    }

                    if(set.contains(f.getName())){
                        JOptionPane.showMessageDialog(new JDialog(),f.getName()+":file already exists!");
                        return;
                    }

                    FileInputStream input = null;
                    FileOutputStream out = null;
                    try {

                        input = new FileInputStream(f);
                        byte[] buffer = new byte[1024];

                        File des = new File(path,f.getName());

                        out = new FileOutputStream(des);
                        int len = 0 ;


                        while((len = input.read(buffer)) != -1){
                            out.write(buffer, 0, len);
                        }

                        out.flush();



                        JOptionPane.showMessageDialog(null, "photo upload success！", "msg",JOptionPane.INFORMATION_MESSAGE);

                    } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                        JOptionPane.showMessageDialog(null, "upload fail！", "msg",JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }catch (IOException e) {
                        // TODO Auto-generated catch block
                        JOptionPane.showMessageDialog(null, "upload fail！", "msg",JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }   finally{
                        try {
                            out.close();
                            input.close();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        final JFileChooser biometricChoose = new JFileChooser();
        JButton bioM = new JButton("upload biometric");
        bioM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {




                biometricChoose.setMultiSelectionEnabled(false);

                biometricChoose.setFileFilter(new FileFilter() {
                    public String getDescription() {
                        return ".jpg" ;
                    }
                    public boolean accept(File f) {
                        return f.getName().toLowerCase().endsWith(".jpg") || f.getName().toLowerCase().endsWith(".png")  ;
                    }
                });

                int returnVar = biometricChoose.showOpenDialog(pRight_center);

                if(returnVar == biometricChoose.APPROVE_OPTION){

                    File f = biometricChoose.getSelectedFile();

                    String fileName =f.getName();
                    imgs.put("bio",f.getName());

                    String prefix=fileName.substring(fileName.lastIndexOf(".")+1);

                    if(!(prefix.equals("jpg") || prefix.equals("png"))){
                        JOptionPane.showMessageDialog(new JDialog(),":please select .jpg or .png format");
                        return;
                    }

                    String path = "./src/main/java/com/hxy/biometric";


                    File dir = new File(path);
                    if(!dir.exists()){
                        dir.mkdirs();
                    }

                    File[] fs = dir.listFiles();

                    HashSet<String> set = new HashSet<String>();

                    for(File a : fs){
                        set.add(a.getName());
                    }

                    if(set.contains(f.getName())){
                        JOptionPane.showMessageDialog(new JDialog(),f.getName()+":file already exists!");
                        return;
                    }

                    FileInputStream input = null;
                    FileOutputStream out = null;
                    try {

                        input = new FileInputStream(f);
                        byte[] buffer = new byte[1024];

                        File des = new File(path,f.getName());

                        out = new FileOutputStream(des);
                        int len = 0 ;

                        String absolutePath = biometricChoose.getSelectedFile().getAbsolutePath();

                        ImageIcon imageIcon = new ImageIcon(absolutePath);


                        while((len = input.read(buffer)) != -1){
                            out.write(buffer, 0, len);
                        }

                        out.flush();


                        JOptionPane.showMessageDialog(null, "biometric upload success！", "msg",JOptionPane.INFORMATION_MESSAGE);

                    } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                        JOptionPane.showMessageDialog(null, "upload fail！", "msg",JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }catch (IOException e) {
                        // TODO Auto-generated catch block
                        JOptionPane.showMessageDialog(null, "upload fail！", "msg",JOptionPane.ERROR_MESSAGE);
                        e.printStackTrace();
                    }   finally{
                        try {
                            out.close();
                            input.close();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
            }
        });





        Date date = new Date();
        final JXDatePicker datepick = new JXDatePicker();

        // 设置 date日期
        datepick.setDate(date);
        datepick.setBounds(137, 83, 177, 24);


        pRight_center.add(new JLabel(" BirthDay： "));
        pRight_center.add(datepick);
        pRight_center.add(new JLabel(" photos： "));
        pRight_center.add(photo);
        pRight_center.add(new JLabel(" Biometric identifiers： "));
        pRight_center.add(bioM);


        bIn = new JButton("confirm");
        bIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(String attri:attris){
                    String info = jpanel_map.get(attri).getText();
                    if(info.equals("")){
                        JOptionPane.showMessageDialog(null, attri+" message lose！", "", JOptionPane.ERROR_MESSAGE );
                        return;
                    }
                    if(attri.equals("Internet protocol addresses")){
                        if(!info.contains("@")){
                            JOptionPane.showMessageDialog(null, attri+" format wrong！", "", JOptionPane.ERROR_MESSAGE );
                            return;
                        }
                    }
                }
                if(choose.getSelectedFile()==null || biometricChoose.getSelectedFile()==null){
                    JOptionPane.showMessageDialog(null, "please upload photo and biometric information！", "", JOptionPane.ERROR_MESSAGE );
                    return;
                }
              JOptionPane.showMessageDialog(null, "message input successful！", "", JOptionPane.INFORMATION_MESSAGE );
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                for(String attri:attris){
                     jpanel_map.get(attri).setText("");
                }
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                List<String> msg = new ArrayList<String>();
                for(String attri:attris){
                    String info = jpanel_map.get(attri).getText();
                    if(info.equals("")){
                        JOptionPane.showMessageDialog(null, "please fill the form", "", JOptionPane.ERROR_MESSAGE );
                        return;
                    }
                   msg.add(info);
                }
                new Visibility("Information",attris,msg,imgs,datepick.getDate());
            }
          });


        pRight_top.add(pRight_create,BorderLayout.NORTH);
        pRight_top.add(pRight_center,BorderLayout.CENTER);
        pRight_top.add(bIn,BorderLayout.SOUTH);

        // 创建一个水平JSplitPane，左边是p1,右边是p2
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pLeft, pRight_top);
        // 设置分割条的位置
        sp.setDividerLocation(80);

        // 把sp当作ContentPane
        f.setContentPane(sp);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);

    }

}