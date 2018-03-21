/**
 * @Content :CalendarFrame.java
 */
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
 
import javax.swing.*;
import javax.swing.border.*;

public class CalendarFrame extends JFrame implements ActionListener,ItemListener{
    /**
     * labelDay[] 存放每一天的标签数组
     * titleName 显示标题栏名称的按钮
     * text 输入年份的文本框
     * button,button1 按钮组件
     * label 标签
     * comBox 下拉列表组件
     * showMessage 显示日历的标签项
     * 
     */
    JLabel labelDay[]=new JLabel[42];                                       
    JButton titleName[]=new JButton[7];                                     
    JTextField text;                                                        
    JButton button,button1;                                                 
    JLabel label1,label2;                                                                       
    JComboBox<String> comBox;                                                       
    String name[]={"Sun.","Mon.","Tue.","Wed.","Thu.","Fri.","Sat."};                            
    CalendarFunc calendar;                                                  
    JLabel showMessage=new JLabel("",JLabel.CENTER);                        
 
    int year=2017,month=11;
    public CalendarFrame(){ 
        /**
         * 创建面板（可向面板中添加组件，再将面板添加到其他容器中）
         */
        JPanel pCenter=new JPanel();        
        /**
         * 将pCenter的布局设置为7行7列的GridLayout布局
         */
        pCenter.setLayout(new GridLayout(7,7)); 
        pCenter.setBackground(Color.WHITE);
        /**
         * 向主容器中添加星期栏
         */
        for(int i=0;i<7;i++){                                               
            titleName[i]=new JButton(name[i]);                              
            titleName[i].setBorder(new SoftBevelBorder(BevelBorder.RAISED));    
            titleName[i].setBackground(Color.gray);
            pCenter.add(titleName[i]);                                      
        }                                                                   
        /**
         * 向主容器添加每个小日期标签
         */
        for(int i=0;i<42;i++){                                              
            labelDay[i]=new JLabel("",JLabel.CENTER);
            labelDay[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));    
            pCenter.add(labelDay[i]);                                       
        }                 
        /**
         * 声明calendar为calendarBean类的子类
         */                                                                 
        calendar=new CalendarFunc();    
        /**
         * 设置个组件的具体内容
         * 
         */                                                                 
        text=new JTextField(3); 
        text.setText("2017");
        button=new JButton("GO");                                   
        button1=new JButton("NOW");                                        
        label1=new JLabel("CALENDAR           ");
        /**
         * 设置label标签的字体大小为35px
         */                                                                 
        label1.setFont(new Font("",1,35));  
        /**
         * 创建下拉列表，并添加下拉列表选项
         */         
        label2=new JLabel("TODAY：");
        comBox=new JComboBox<String>();                                                                                         
        String []a={"1","2","3","4","5","6","7","8","9","10","11","12"};
        for(int i=0;i<a.length;i++)                                         
        comBox.addItem(a[i]);       
        /**
         * 向组件添加响应事件
         */                                                                 
        button.addActionListener(this);                                 
        button1.addActionListener(this);                                    
        comBox.addItemListener(null);   
        /**
         * 创建pNorth，pSouth面板
         */                                                                 
        JPanel pNorth=new JPanel(); 
        pNorth.setBackground(Color.GRAY);
        JPanel pSouth=new JPanel();     
        /**
         * 向面板中添加各个组件
         */                                                                 
        pNorth.add(label1);     
        pNorth.add(label2);
        pSouth.add(button1);                                                                                                                                    
        pSouth.add(text);
        pSouth.add(new JLabel("year"));                    
        pSouth.add(comBox); 
        pSouth.add(new JLabel("month"));                                                                                        
        pSouth.add(button);                                                 
        pSouth.add(showMessage);        
        /**
         * 将三个面板添加到以BorderLayout为布局的主Windows型容器中
         */                                                                 
        add(pCenter,BorderLayout.CENTER);                                   
        add(pNorth,BorderLayout.NORTH);                                     
        add(pSouth,BorderLayout.SOUTH);     
        /**
         * 向setYearAndMonth方法传入year，month的值
         */                                                                 
        setYearAndMonth(year,month);
        /**
         * 设置，当点击窗体右上角的关闭图标时，程序会做出直接结束程序的处理
         */                                                                 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);                         
    }

    public void setYearAndMonth(int y,int m){                               
        calendar.setYear(y);                                                               
        calendar.setMonth(m);

        /**
         * 获取calendar类中getCalendar方法中的日期字符串数组，将获取的字符串数组的值传给每个labelDay小日期标签
         */ 
        String day[]=calendar.getCalendar();
        for(int i=0;i<42;i++)                                               
            labelDay[i].setText(day[i]);    
        /**
         * 在showMessage标签中显示输出日期
         */ 
        showMessage.setText("Calendar   "+"year: "+calendar.getYear()+" month: "+calendar.getMonth());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        label2.setText("TODAY:"+df.format(new Date()));
        showMessage.setForeground(Color.BLUE);                              
    }                                                                       
    /**
     * ---------重写actionPerformed方法---------
     */ 
    public void actionPerformed(ActionEvent e){                             
        /**
         * reg为正则表达式，表示纯数字的字符串（不含其他任何与数字无关的字符）
         */
        String reg="^[\\d]*$";
        /**
         * 判断响应事件触发的是button组件
         */
        if(e.getSource()==button){                                          
            /**
             * 这个地方如何让程序识别并弹出对话框，而不是在未输入时直接判别程序出错
             */ 
            if(text.getText().isEmpty()){               
 
                JOptionPane.showMessageDialog(this, "you need enter year", "Message", JOptionPane.WARNING_MESSAGE);
                /**
                 * 将屏幕焦点聚在text组件上
                 */
                text.requestFocus(true);
            }
            /**
             * 判断text文本框中是否为纯数字，若不是则弹出对话框 "您输入了非法字符"
             */
            else if(!(text.getText()).matches(reg)){
            JOptionPane.showMessageDialog(this, "you need enter right string", "Message", JOptionPane.WARNING_MESSAGE);
            }
            /**
             * 判断text文本框中是否为纯数字，若是，则输出相应年份
             */
            else {
 
                /**
                 * 将文本框中得到的字符串强制转为整型值，并赋值给整型变量i
                 */ 
            Integer i=Integer.parseInt(text.getText()); 
            /**
             * 将整型i变量中的值传递给calendar类中，并设置为year值
             */
            calendar.setYear(i);
            }
 
 
            /**
             * 判断用户是否使用了下拉列表框，若未使用，则弹出消息对话框 "您未选择月份"
             */
            if(((String)comBox.getSelectedItem()).equals("choose month"))   {           
                JOptionPane.showMessageDialog(this, "you need enter month", "Message", JOptionPane.WARNING_MESSAGE);
                /**
                 * 将屏幕焦点聚在comBox组件上
                 */
                comBox.requestFocus(true);
            }
            else{
            /**
             * 将下拉列表框中选中的字符串值强制转换为整型，并赋值给整型变量j
             */ 
            Integer j=Integer.parseInt(comBox.getSelectedItem().toString());
            /**
             * 将整型i变量中的值传递给calendar类中，并设置为month值
             */ 
            calendar.setMonth(j);                                           
            /**
             * 获取calendar类中getCalendar方法中的日期字符串数组
             */ 
            String day[]=calendar.getCalendar();                            
            /**
             * 将获取的字符串数组的值传给每个labelDay小日期标签
             */ 
            for(int n=0;n<42;n++){
                labelDay[n].setText(day[n]);                                    
            }
            }
            /**
             * 在showMessage标签中显示输出日期
             */ 
            showMessage.setText("Calendar   "+"year: "+calendar.getYear()+" month: "+calendar.getMonth());
        }
        // 判断响应时间触发的是button1组件

        else if(e.getSource()==button1){        
            //获取系统当前日期 
            Calendar c=Calendar.getInstance();                              
            int y=c.get(Calendar.YEAR);                                     
            int m=c.get(Calendar.MONTH)+1;
            calendar.setMonth(m);
            String day[]=calendar.getCalendar();                            
            for(int n=0;n<42;n++){
                labelDay[n].setText(day[n]);                                    
            }
            showMessage.setText("Calendar："+"year: "+y+" month: "+m); 
            text.setText("");
        }                                                                   
        /**
         * 设置showMessage标签的字体颜色为蓝色
         */ 
        showMessage.setForeground(Color.BLACK);                              
    }
    /**
     * ---------重写itemStateChanged方法--------
     * 下拉列表的响应事件具体已经在actionPerformed方法内实现
     */ 
    public void itemStateChanged(ItemEvent arg0) {                          
        // TODO Auto-generated method stub                                  
    }                                                                       
}