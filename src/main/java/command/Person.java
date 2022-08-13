package command;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {
    public int age;
    public String name;
    public String sex;

    public void person(){
    }
    public String info(){
        String result = "age : "+ this.age + " name : " + this.name + " sex : " + this.sex;
        return result;
    }
}
