package rholang.parsing.delimc.Absyn; // Java Package generated by the BNF Converter.

public class TFun extends Type {
  public final Type type_1, type_2;
  public TFun(Type p1, Type p2) { type_1 = p1; type_2 = p2; }

  public <R,A> R accept(rholang.parsing.delimc.Absyn.Type.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.delimc.Absyn.TFun) {
      rholang.parsing.delimc.Absyn.TFun x = (rholang.parsing.delimc.Absyn.TFun)o;
      return this.type_1.equals(x.type_1) && this.type_2.equals(x.type_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.type_1.hashCode())+this.type_2.hashCode();
  }


}
