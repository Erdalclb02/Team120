package day19_scope;

public class C03_başkaClssdanClassVariablelaraErişim {

    public static void main(String[] args) {



                System.out.println(C02_classLevelVariabler.bls); // false
                System.out.println(C02_classLevelVariabler.strs); // Java
                System.out.println(C02_classLevelVariabler.sayis); // 0
                System.out.println(C02_classLevelVariabler.chrs); // a


                C02_classLevelVariabler obj = new C02_classLevelVariabler();

                System.out.println(obj.bli); // false
                System.out.println(obj.stri); // null
                System.out.println(obj.sayii); // 23
                System.out.println(obj.chri); // ''


                System.out.println(obj.bls);
                System.out.println(obj.strs);


            }
        }





