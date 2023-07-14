public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int noteS1, int noteS2, int noteS3){
        if(note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
        if(noteS1 >= 0 && noteS1 <= 100){
            this.c1.noteS = noteS1;
        }
        if(noteS2 >= 0 && noteS2 <= 100){
            this.c2.noteS = noteS2;
        }
        if(noteS3 >= 0 && noteS3 <= 100){
            this.c3.noteS = noteS3;
        }
    }

    void isPass(){
        System.out.println("***************");
        this.avarage = ((this.c1.note * 0.8 + this.c1.noteS * 0.2)+(this.c2.note * 0.8 + this.c2.noteS * 0.2)+
        		(this.c3.note * 0.8+this.c3.noteS * 0.2)) / 3.0;
        if(this.avarage >= 50){
            System.out.println("Sınıfı Geçtiniz.");
            this.isPass = true;
        }
        else{
            System.out.println("Sınıfı Geçemediniz.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Sınav Notu :" + this.c1.note + "\nSözlü Notu :" + this.c1.noteS);
        System.out.println(this.c2.name + " Sınav Notu :" + this.c2.note + "\nSözlü Notu:" + this.c2.noteS);
        System.out.println(this.c3.name + " Sınav Notu :" + this.c3.note + "\nSözlü Notu :" + this.c3.noteS);
        System.out.println("ORTALAMANIZ: " + this.avarage);

    }

}