/*
 * @(#)WhileCommand.java                       
 * 
 * Revisions and updates (c) 2022-2023 Sandy Brownlee. alexander.brownlee@stir.ac.uk
 * 
 * Original release:
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package triangle.abstractSyntaxTrees.commands;

import triangle.abstractSyntaxTrees.expressions.Expression;
import triangle.abstractSyntaxTrees.visitors.CommandVisitor;
import triangle.syntacticAnalyzer.SourcePosition;

// Task 6A: creating the new loopWhile command handler class
public class LoopWhileCommand extends Command {

    // initializing expression and command objects
    public Expression E;
    public final Command C1, C2;

	public LoopWhileCommand(Expression eAST, Command c1AST, Command c2AST, SourcePosition position) {
		super(position);
        // the required objects to be used for the specific type of command 'loopWhile'
        C1 = c1AST;
		E = eAST;
		C2 = c2AST;
	}

	public <TArg, TResult> TResult visit(CommandVisitor<TArg, TResult> v, TArg arg) {
		return v.visitLoopWhileCommand(this, arg);
	}

}

