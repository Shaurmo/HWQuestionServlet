package com.gmail.shaurmo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class QuestionServlet extends HttpServlet {

    static final int QUESTION_1_YES = 0;
    static final int QUESTION_1_NO = 1;
    static final int QUESTION_2_MAN = 2;
    static final int QUESTION_2_WOMAN = 3;

    static final String TEMPLATE = "<html>" +
            "<head><title>Question</title></head>" +
            "<body><h1>%s</h1></body></html>";

    final int[] results = new int[4];

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String q1 = request.getParameter("question1");
        final String q2 = request.getParameter("question2");

        final int idx1 = "yes".equals(q1) ? QUESTION_1_YES : QUESTION_1_NO;
        final int idx2 = "man".equals(q2) ? QUESTION_2_MAN : QUESTION_2_WOMAN;

        results[idx1]++;
        results[idx2]++;

        String res = "<table border = '1'><p><tr><th>Do you speak english?</th><th>yes = " + results[QUESTION_1_YES] + "</th><th>no = " + results[QUESTION_1_NO] + "</th></tr></p>";
        res += "<p><tr><th>Gender</th><th>man = " + results[QUESTION_2_MAN] + "</th><th>woman = " + results[QUESTION_2_WOMAN] + "</th></tr></p></table>";

        response.getWriter().println(String.format(TEMPLATE, res));
    }
}
