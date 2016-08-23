package blacknightstudios.testingmulticolumncheckbox;

/**
 * Created by black_000 on 8/13/2016.
 */
public class Model  {
    String name;
    String age;
    String gender;
    String status;
    int value; /* 0 -&gt; checkbox disable, 1 -&gt; checkbox enable */

    Model(int value, String name, String gender, String age, String status){
        this.name = name;
        this.value = value;
        this.age = age;
        this.gender = gender;
        this.status = status;
    }
    public String getName(){
        return this.name;
    }
    public int getValue(){
        return this.value;
    }
    public String getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
    public String getStatus(){
        return this.status;
    }
}
