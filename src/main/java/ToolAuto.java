import dto.RbgColor;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ToolAuto {
    public static String NAM_YEU_40 = "Nấm Yêu Huyết Hồng (lv40)";
    public static void main(String[] args) throws IOException,
            AWTException, InterruptedException {

//        String command = "notepad.exe";
//        Runtime run = Runtime.getRuntime();
//        run.exec(command);
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        // Create an instance of Robot class
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_E);
//        Thread.sleep(500);
//        robot.keyPress(KeyEvent.VK_K);
//        Thread.sleep(500);
//        robot.keyPress(KeyEvent.VK_S);
//        robot.mouseMove(1365,200);

        while (true) {
            Thread.sleep( 2 * 1000);
            PointerInfo a = MouseInfo.getPointerInfo();
            Point b = a.getLocation();
            int x = (int) b.getX();
            int y = (int) b.getY();
            System.out.println(String.format("X: %d | Y: %d", x, y));
        }
    }


    public void addTextToClipBoard(String input) {
        StringSelection stringSelection = new StringSelection(input);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
    }

    public void pasteStringFromClipBoard(Robot robot) {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
}
