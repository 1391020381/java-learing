
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Person {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// 参数不同而已
	public void setName(String firtName,String lastName) {
		this.name = firtName + lastName;
	}
}
