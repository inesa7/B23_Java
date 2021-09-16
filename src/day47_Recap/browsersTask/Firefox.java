package day47_Recap.browsersTask;

    public final class Firefox extends Browser { // Firefox is a Browser


        @Override
        public void open() {
            System.out.println("Opening Firefox Browser");
        }

        @Override
        public void close() {
            System.out.println("Closing Firefox Browser");
        }
    }


