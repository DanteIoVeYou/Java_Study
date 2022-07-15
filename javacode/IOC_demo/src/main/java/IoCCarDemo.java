public class IoCCarDemo {

    public static void main(String[] args) {
        Tire tire = new Tire(15);
        Bottom bottom = new Bottom(tire);
        Framework framework = new Framework(bottom);
        Car car = new Car(framework);
        car.init();
    }

    static class Tire {

        private int size;

        public Tire(int size) {
            this.size = size;
        }

        private void init() {
            System.out.println("轮胎尺寸" + this.size);
        }
    }

   static class Bottom {
        // 接受注入的轮胎对象
        private Tire tire;

        public Bottom(Tire tire) {
            // 注入下层的依赖对象(轮胎)
            this.tire = tire;
        }

        public void init() {
            tire.init();
        }

   }

   static class Framework {

        private Bottom bottom;

        public Framework(Bottom bottom) {
            this.bottom = bottom;
        }

        void init() {
            bottom.init();
        }

   }

   static class Car {

        private Framework framework;

        public Car(Framework framework) {
            this.framework = framework;
        }

        public void init() {
            framework.init();
        }

   }

}
