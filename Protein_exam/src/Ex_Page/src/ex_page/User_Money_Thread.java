package Ex_Page.src.ex_page;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class User_Money_Thread extends Thread
{
    User user;
    JLabel nameLabel;  // 사용자 금액을 표시하는 레이블

    public User_Money_Thread(User user, JLabel nameLabel) 
    {
        this.user = user;
        this.nameLabel = nameLabel;  // UI 레이블을 받아옴
    }

    @Override
    public void run() 
    {
        while (true) 
        {
            try 
            {
                // 0.5초마다 UI를 업데이트
                Thread.sleep(100);
                SwingUtilities.invokeLater(new Runnable() 
                {
                    @Override
                    public void run() 
                    {
                        // UI 업데이트는 EDT에서 처리
                        nameLabel.setText(user.getName() + "   보유금액 : " + user.getMoney() + "원");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
