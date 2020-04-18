package com.itm;

public abstract class Expression {
    public abstract String one();
    public abstract String four();
    public abstract String five();
    public abstract String nine();
    public abstract int multiplier();

    public void interpret(Context context) {
        if (context.input.startsWith(nine())) {
            context.output += (9 * multiplier());
            context.input = context.input.substring(2);
        }

        if (context.input.startsWith(four())) {
            context.output += (4 * multiplier());
            context.input = context.input.substring(2);
        }

        if (context.input.startsWith(five())) {
            context.output += (5 * multiplier());
            context.input = context.input.substring(1);
        }

        while (context.input.startsWith(one())) {
            context.output += (1 * multiplier());
            context.input = context.input.substring(1);
        }
    }
}
