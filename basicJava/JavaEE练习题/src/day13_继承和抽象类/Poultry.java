package day13_继承和抽象类;

//    定义抽象家禽类(Poultry)
public abstract class Poultry {
    //私有成员变量：动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
    // 提供空参和带参构造方法
    private String name;
    private String symptom;
    private int age;
    private String illness;

    public Poultry() {
    }

    public Poultry(String name, String symptom, int age, String illness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }

    //成员方法：
    //    抽象方法症状(showSymptom)
    //    普通方法基本信息(showMsg)
    //    提供setXxx和getXxx方法
    public abstract void showSymptom();

    public void showMsg() {
        System.out.println("动物种类:" + name + ",动物年龄:" + this.age + ",动物症状:" + this.symptom + ",病因:" + this.illness);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
