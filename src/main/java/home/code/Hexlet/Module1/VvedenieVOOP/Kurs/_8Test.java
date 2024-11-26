//package home.code.Hexlet.Module1.VvedenieVOOP.Kurs;
//import org.apache.commons.lang3.RandomStringUtils;
//
//class SimplePasswordGenerator implements PasswordGenerator {
//    public String generate() {
//        return this.generate(16);
//    };
//
//    public String generate(int length) {
//        return RandomStringUtils.randomNumeric(length);
//    };
//}
//
//class SuperPasswordGenerator implements PasswordGenerator {
//    public String generate() {
//        return this.generate(16);
//    };
//
//    public String generate(int length) {
//        return RandomStringUtils.randomAlphanumeric(length);
//    };
//}
//
//class UserController {
//    public String create(PasswordGenerator generator) {
//        var password = generator.generate(10);
//        return password;
//    }
//}
//
//interface PasswordGenerator {
//    String generate(int length);
//}
//
//public class _8Test {
//    public static void main(String[] args) {
//        PasswordGenerator simpleGenerator = new SimplePasswordGenerator();
//        PasswordGenerator superGenerator = new SuperPasswordGenerator();
//        UserController controller = new UserController();
//        var simplePass = controller.create(simpleGenerator);
//        System.out.println("Простой пароль: " + simplePass);
//        var superPass = controller.create(superGenerator);
//        System.out.println("Супер пароль: " + superPass);
//    }
//}
