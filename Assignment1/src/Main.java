import operations.Operations;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Operations op = new Operations();
        while (flag) {
            int n = op.showChoice();
            switch (n) {
                case 1:
                    op.addChoice();
                    break;
                case 2:
                    op.viewChoice();
                    break;
                case 3:
                    op.searchChoice();
                    break;
                case 4:
                    op.deleteChoice();
                    break;
                case 5:
                    op.exitChoice();
                    flag = false;
                    break;
            }
        }
    }
}
