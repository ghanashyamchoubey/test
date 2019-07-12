package Demo;

public class BuilderPatternAndImmutable {

	private final String name;
	private final int age;

	public BuilderPatternAndImmutable(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		BuilderPatternAndImmutable p = BuilderPatternAndImmutable.Builder.newBuilder().setName("abcd").setAge(10)
				.build();
		System.out.println(p.hashCode());
		p = BuilderPatternAndImmutable.Builder.newBuilder().setName("abcd").setAge(30).build();
		System.out.println(p.hashCode());
	}

	@Override
	public String toString() {
		return name + ">>" + age;
	}

	static class Builder {
		private String name;
		private int age;

		public static Builder newBuilder() {
			return new Builder();
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public BuilderPatternAndImmutable build() {
			return new BuilderPatternAndImmutable(this.name, this.age);
		}
	}

}
