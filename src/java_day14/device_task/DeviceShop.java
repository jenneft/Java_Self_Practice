package java_day14.device_task;


public class DeviceShop {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("Apple", "15ProMax", "256GB", 1200, "Space Gray", true, true);
        Samsung samsung = new Samsung("Samsung", "Galaxy S5", "126", 1000, "Silver", true, true);
        Google google = new Google("Google", "Google Pixel 8", "512", 900, "White", false, true);
        Desktop desktop = new Desktop("Apple", "IMac", "24 inch", 1700, "Space Gray", true, true, 8, 256);
        Laptop laptop = new Laptop("Apple", "MacBook Air", "13 inch", 1200, "Cosmic Blue", true, true, 8, 256);


        test(iPhone);
        test(samsung);
        test(google);
        test(desktop);
        test(laptop);

        iPhone.downloadApp();


        desktop.createFile("Task1");
        desktop.deleteFile("Task2");
        desktop.restart();
        desktop.lockScreen();

        laptop.createFile("Task1");
        laptop.deleteFile("Task2");
        laptop.takeScreenshot();
        laptop.lockScreen();



        iPhone.call(23049141);
        samsung.text(12314141);
        samsung.call(13413414);
        google.text(414141414);
        google.call(1412414141);
    }



    private static void test(Device device) {
        System.out.println("Testing " + device.getClass().getSimpleName() + ":");

        device.turnOn();
        device.turnOff();


        System.out.println("Device information: " + device);

        if (device instanceof Downloadable) {
            System.out.println("Device is downloadable. Attempting to download an app...");
            ((Downloadable) device).downloadApp();
            System.out.println("Download completed.");
        }
        if (device instanceof AndroidApps) {
            AndroidApps androidDevice = (AndroidApps) device;
            System.out.println("App Store Name: " + androidDevice.AppStoreName());
            System.out.println("OS: " + androidDevice.OS());
        }
        if (device instanceof AppleApps) {
            AppleApps appleDevice = (AppleApps) device;
            System.out.println("App Store Name: " + appleDevice.AppStoreName());
            System.out.println("OS: " + appleDevice.OS());
        }


        System.out.println();
    }

}
/*
9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.

 */