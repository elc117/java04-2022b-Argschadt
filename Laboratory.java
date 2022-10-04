import java.util.ArrayList;

public class Laboratory {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Professor> professors;

  public Laboratory() {
  }

  public Laboratory(String name) {
    this.name = name;
    this.students = new ArrayList<Student>();
    this.professors = new ArrayList<Professor>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addMember(Student s) {
    this.students.add(s);
  }

  public void addMember(Professor p) {
    this.professors.add(p);
  }
  
  public ArrayList<String> getContactInfos() {
    // COMPLETE-ME
    // Construa um ArrayList<String> contendo informações de contato (ContactInfo)
    // de cada um dos estudantes e professores
    ArrayList<String> contato = new ArrayList<String>();
	  
	for(Professor professor : professors) {
		contato.add(professor.getContactInfo());
	}
	
	for(Student student : students) {
		contato.add(student.getContactInfo());
	}
	return contato;
  }

  public boolean userExists(String userId) {
    // COMPLETE-ME
    // Verifique se existe o userId na lista de estudantes ou de professores
	  for(int i = 0 ; i < students.size() ; i++ ) {
		  if (userId.equals(students.get(i).getUserId())) {
			  return true;
		  }
	  }
	  
	  for(Professor professor : professors) {
		  if(userId == professor.getUserId()) {
			  return true;
		  }
	  }
	  return false;
  }

  public int countMembers() {
    // COMPLETE-ME
    return students.size() + professors.size();
    
  }


}