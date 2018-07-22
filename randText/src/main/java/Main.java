import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String text = "Моя любимая КУДРЯШКА";
        String alf = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ";
        text = text.toUpperCase();
        alf = alf.toUpperCase();
        int pos = 0;
        while (pos < text.length()) {
            for (int i = 0; i < 50; i++) {
                System.out.print('\r' + text.substring(0, pos));
                int startPos = (int) (Math.random() * alf.length());
                String oneChar = alf.substring(startPos, startPos + 1);
                System.out.print(oneChar);
                Thread.sleep(10);
            }
            pos++;
            System.out.print('\r' + text.substring(0, pos));
        }
    }
}
