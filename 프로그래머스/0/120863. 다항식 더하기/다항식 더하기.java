class Solution {
    public String solution(String polynomial) {
        int xCoefficient = 0;
        int constant = 0;

        String[] terms = polynomial.split(" \\+ ");

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    xCoefficient += 1;
                } else {
                    xCoefficient += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                constant += Integer.parseInt(term);
            }
        }

        StringBuilder result = new StringBuilder();
        if (xCoefficient != 0) {
            result.append(xCoefficient == 1 ? "x" : xCoefficient + "x");
        }
        if (constant != 0) {
            if (result.length() > 0) {
                result.append(" + ");
            }
            result.append(constant);
        }

        return result.toString();
    }

}
