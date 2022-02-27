package CustomArrayList.com;

public class Test {
	public static void main(String[] args) {

		CustomArrayList cl = new CustomArrayList(5);

		cl.addtoInsert(1);
		cl.addtoInsert(11);
		cl.addtoInsert(12);
		cl.addtoInsert(13);
		cl.addtoInsert(14);
		cl.addtoInsert(15);
		cl.addtoInsert(16);

		cl.removes(2);
		System.out.println(cl.getMehod(4));
		System.out.println(cl);

	}
}
