package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("what is your name?");
	JOptionPane.showMessageDialog(null, "Hello "+ input);
	input = JOptionPane.showInputDialog("Do you like coding?");
	JOptionPane.showMessageDialog(null, "If you said "+ input + "get out of my house");
	input = JOptionPane.showInputDialog ("how are you?");
	JOptionPane.showMessageDialog(null, "I Don't care");
	input = JOptionPane.showInputDialog("Are you good at fortnite?");
	JOptionPane.showMessageDialog(null, "I am dissapointed");
	input = JOptionPane.showInputDialog("Do you have a boyfriend or girlfriend?");
	JOptionPane.showMessageDialog(null, "No way, that is not possible");
	}} 