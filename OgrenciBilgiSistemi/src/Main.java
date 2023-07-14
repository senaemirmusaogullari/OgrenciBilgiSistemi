
public class Main {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("Ali Veli", "TRH", "05510000000");
        Teacher t2 = new Teacher("Ayşe Fatma", "FZK", "05520000000");
        Teacher t3 = new Teacher("Veli Yılmaz", "KMYA", "05530000000");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        
        Course kimya = new Course("Kimya", "202", "KMYA");
        kimya.addTeacher(t3);

        Student s1 = new Student("Fatma Şen", "23547", "4", tarih,fizik,kimya);
        s1.addBulkExamNote(100,89,90,40,31,89);
        s1.isPass();

        Student s2 = new Student("Ahmet Sağlam", "35631"," 3", tarih,fizik,kimya);
        s1.addBulkExamNote(56,57,21,35,75,45);
        s2.isPass();
    }
}