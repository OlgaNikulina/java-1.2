public class Main {
    public static void main(String[] args) {
        System.out.println("public class Main {\n" +
                "  public static void main(String[] args) {\n" +
                "    // TODO: подставлять номер карты нужно сюда между двойными кавычками, без пробелов\n" +
                "    String number = \"5351719427810741\";\n" +
                "    System.out.println(String.format(\"Result is %s\", isValidCardNumber(number) ? \"OK\" : \"FAIL\"));\n" +
                "  }\n" +
                "\n" +
                "  public static boolean isValidCardNumber(String number) {\n" +
                "    if (number == null) {\n" +
                "      return false;\n" +
                "    }\n" +
                "\n" +
                "    if (number.length() != 16) {\n" +
                "      return false;\n" +
                "    }\n" +
                "\n" +
                "    long result = 0;\n" +
                "    for (int i = 0; i < number.length(); i++) {\n" +
                "      int digit;\n" +
                "      try {\n" +
                "        digit = Integer.parseInt(number.charAt(i) + \"\");\n" +
                "      } catch (NumberFormatException e) {\n" +
                "        return false;\n" +
                "      }\n" +
                "\n" +
                "      if (i % 2 == 0) {\n" +
                "        digit *= 2;\n" +
                "        if (digit > 9) {\n" +
                "          digit -= 9;\n" +
                "        }\n" +
                "      }\n" +
                "      result += digit;\n" +
                "    }\n" +
                "\n" +
                "    return (result != 0) && (result % 10 == 0);\n" +
                "  }\n" +
                "}");
    }
}
