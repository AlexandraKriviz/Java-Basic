public class Lift {
    public static int numberOfLifts (int H, int N,int M) {
        int currentFloor = 1;
        int lifts = 0;
        while (currentFloor < H) {
            currentFloor += N;
            lifts++;
            if (currentFloor >= H) {
                break;
            }
            currentFloor -= M;
        }
            return lifts;
        }

        public static void main (String[]args){
            int H = 200;
            int M = 1;
            int N = 50;
            int lifts = numberOfLifts(H, N, M);
            System.out.println("Количество подъёмов лифта составляет " + lifts);
        }

    }









