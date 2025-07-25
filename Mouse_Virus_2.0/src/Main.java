import java.awt.*;


public class Main {

    public static void main(String[] args) {

        Frame myFrame = new Frame();
        myFrame.setVisible(true);
        my_Thread();

    }

    public static void my_Thread(){



        Runnable thread = new Thread(() -> {


            try {

                Robot r = new Robot();

                int [] x = {100,200,120,300,400,20,50,60};
                int [] y = {100,80,40,30,200,500,60,220};

                for(int pos_x : x){
                    for (int pos_y : y){

                                r.mouseMove(pos_x, pos_y);
                                r.delay(100);
                                r.mouseMove(pos_x, pos_y);
                                r.delay(10);
                                r.mouseMove(pos_x, pos_y);
                                r.delay(90);
                                r.mouseMove(pos_x, pos_y);
                                r.delay(100);
                                r.mouseMove(pos_x, pos_y);
                                r.delay(100);
                                r.mouseMove(pos_x, pos_y);
                                r.delay(10);
                                r.mouseMove(pos_x, pos_y);
                                r.delay(90);
                                r.mouseMove(pos_x, pos_y);
                                r.delay(100);
                                r.mouseMove(pos_x, pos_y);
                                r.delay(100);
                                r.mouseMove(pos_x, pos_y);
                                r.delay(10);
                                r.mouseMove(pos_x, pos_y);
                                r.delay(90);
                                r.mouseMove(pos_x, pos_y);
                                r.delay(100);
                                }


                            while (true){
                                r.mouseMove(0,0);
                            }

                    }


            } catch (AWTException e) {
                throw new RuntimeException(e);
            }

        });
        
        thread.run();
    }
}