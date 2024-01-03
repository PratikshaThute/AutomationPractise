package interface_Example;

public class Execute implements Pg{

	public static void main(String[] args) {
		
		Pg exe = new Execute();
		exe.stream();
		System.out.println("During Graduation we have "+exe.sem+ " semester");
		exe.Specialization();
		System.out.println("In my Post Graduation i had " +exe.semester+ " semester");
	}

	@Override
	public void stream() {
		System.out.println("Graduation Stream is Engineering");
		
	}

	@Override
	public void Specialization() {
		System.out.println("Specialization in the Post Graduation is in MBA");
		
	}

}
