public class UnitsConverter {
	private static double numberToConvert = 0;

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java UnitsConverter <weight in pounds>");
			System.exit(0);
		}
		numberToConvert = Double.parseDouble(args[0]);
		System.out.println("lbs " + args[0] + " equals:\n");
		for (Converter converter : Converter.values()) {
			System.out.printf("%s: %f%n", converter,
					converter.performConversion(numberToConvert));
		}
	}
}

/*
 * Each converter contains its own performConversion method definition We can
 * always add a new converter definition to this class
 */
enum Converter {
	KG("kg") {
		@Override
		double performConversion(double f) {
			return f *= 0.45359237;
		}
	},
	CARAT("carat") {
		@Override
		double performConversion(double f) {
			return f *= 2267.96185;
		}
	},
	GMS("gms") {
		@Override
		double performConversion(double f) {
			return f *= 453.59237;
		}
	},
	OUNCE("ounce") {
		@Override
		double performConversion(double f) {
			return f *= 16;
		}
	},
	STONE("stone") {
		@Override
		double performConversion(double f) {
			return f *= 0.071428571429;
		}
	},
	TROYOUNCE("troy ounce") {
		@Override
		double performConversion(double f) {
			return f *= 14.583333333;
		}
	};

	private final String symbol;

	Converter(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}

	/*
	 * each constant will have its own implementation of this method
	 */
	abstract double performConversion(double f);
}
