import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str[] = br.readLine().split("");

        Stack<String> Lstack = new Stack<String>();

        for (String s : str) {
            Lstack.push(s);
        }

        int N = Integer.parseInt(br.readLine());

        Stack<String> Rstack = new Stack<String>();

        while (N-- > 0) {
            String command[] = br.readLine().split(" ");

            if (command[0].equals("P")) {
                Lstack.push(command[1]);
            } else if (command[0].equals("L")) {
                if (!Lstack.isEmpty()) {
                    Rstack.push(Lstack.pop());
                }
            } else if (command[0].equals("D")) {
                if (!Rstack.isEmpty()) {
                    Lstack.push(Rstack.pop());
                }
            } else if (command[0].equals("B")) {
                if (!Lstack.isEmpty()) {
                    Lstack.pop();
                }
            }
        }

        while (!Lstack.isEmpty()) {
            Rstack.push(Lstack.pop());
        }

        while (!Rstack.isEmpty()) {
            bw.write(Rstack.pop());
        }

        bw.flush();
        bw.close();
    }
}