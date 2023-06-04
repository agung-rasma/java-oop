package contoh.folder.aplikasi;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

//        try {
//            String[] names = {
//                    "Agung", "Wijaya", "Rasma"
//            };
//            System.out.println(names[100]);
//
//        } catch (Throwable throwable) {
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
////            System.out.println(stackTraceElements);
//            throwable.printStackTrace();
//        }
    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Agung", "Wijaya", "Rasma"
            };
            System.out.println(names[100]);

        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
