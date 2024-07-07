package vtaras.patterns.behavioral.interpreter;

/*
 * The Interpreter pattern is a behavioral design pattern that evaluates language grammar or expressions by defining a class for each grammar rule with an interpret method
 *
 * It's useful for parsing and interpreting expressions like mathematical formulas or simple programming languages
 */
public interface Expression {

    int interpret();
}
