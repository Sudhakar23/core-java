package com.scjpdumps;
interface A{}
interface C{}
interface D extends A,C{}
 class Super {
 private int a;
 protected Super(int a) { this.a = a; }
 }

 class Sub extends Super {
 public Sub(int a) { super(a); }
// public Sub() { this.a = 5; }
 public Sub() { this(5); }
 }
public class Q8 {

}
