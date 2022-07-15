public class CarDemo {

    public static void main(String[] args) {
        Car car = new Car();
        car.run();
    }

    /**
     * 汽车类
     */
    static class Car {
        public void run() {
            Framework framework = new Framework();
            framework.init();
        }
    }

    /**
     * 车架类
     */
    static class Framework {
        public void init() {
            Bottom bottom = new Bottom();
            bottom.init();
        }
    }

    /**
     * 底盘类
     */
    static class Bottom {
        public void init() {
            Tire tire = new Tire();
            tire.init();
        }
    }

    /**
     * 轮胎类
     */
    static class Tire {
        private int size = 15;

        public void init() {
            System.out.println("轮胎尺寸" + size);
        }
    }

}

