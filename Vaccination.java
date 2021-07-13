import java.time.Year;
class Vaccination{
private String photoID;
private long photoIDNumber;
private String name;
private String gender;
private int yearOfBirth;
public Vaccination(String photoID,long photoIDNumber,String name,String gender,int yearOfBirth){
this.photoID=photoID;
this.photoIDNumber=photoIDNumber;
this.name=name;
this.gender=gender;
this.yearOfBirth=yearOfBirth;
}
public void setPhotoID(String photoID){
 this.photoID=photoID;
}
public void setphotoIDNumber(long photoIDNumber){
this.photoIDNumber=photoIDNumber;
}
public void setName(String name){
 this.name=name;
}
public void setGender(String gender){
this.gender=gender;
}
public void setYearOfBirth(int yearOfBirth){
this.yearOfBirth=yearOfBirth;
}
public String getPhotoID(){
return this.photoID;
}
public long getphotoIDNumber(){
return this.photoIDNumber;
}
public String getName(){
return this.name;
}
public String getGender(){
return  this.gender;
}
public int getYearOfBirth(){
return this.yearOfBirth;
}
}
class Main{
public static void main(String args[]){
 Vaccination vaccinationPerson1=new Vaccination("1234abcd",12,"Srikanth","male",1998);
 Vaccination vaccinationPerson2=new Vaccination("1234abcdefg",13,"Sindhu","female",1960);

 int year=Year.now().getValue();
 
 if((year-vaccinationPerson2.getYearOfBirth())>45)
 {
  System.out.println("Covishield");
 }
 else{
  System.out.println("Covaxin");
 }
}
}
