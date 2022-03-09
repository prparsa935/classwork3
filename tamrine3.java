public class tamrine3 {
    static interface Myinteger{
        public boolean isEven(int x);
        public boolean isOdd(int x);
        public boolean isPosetive(int x);
        public boolean isNegative(int x);
        public boolean isZero(int x);
    }
    public static class Integer_Bool implements Myinteger {


        @Override
        public boolean isEven(int x) {
            if (x % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public boolean isOdd(int x) {
            if (x % 2 == 1) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public boolean isPosetive(int x) {
            if (x >= 0) {
                return true;
            } else if (x <= 0) {
                return false;
            }
            return false;
        }

        @Override
        public boolean isNegative(int x) {
            if (x <= 0) {
                return true;
            } else if (x >= 0) {
                return false;
            }
            return false;
        }


        @Override
        public boolean isZero(int x) {
            if (x == 0) {
                return true;
            }
            else {
                return false;
            }
        }}
    

    public static void main(String[] args) {

    }
}
