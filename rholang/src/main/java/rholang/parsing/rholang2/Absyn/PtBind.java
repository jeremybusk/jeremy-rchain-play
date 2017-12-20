package rholang.parsing.rholang2.Absyn; // Java Package generated by the BNF Converter.

public class PtBind extends PatternBind {
  public final CPattern cpattern_1, cpattern_2;
  public PtBind(CPattern p1, CPattern p2) { cpattern_1 = p1; cpattern_2 = p2; }

  public <R,A> R accept(rholang.parsing.rholang2.Absyn.PatternBind.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang2.Absyn.PtBind) {
      rholang.parsing.rholang2.Absyn.PtBind x = (rholang.parsing.rholang2.Absyn.PtBind)o;
      return this.cpattern_1.equals(x.cpattern_1) && this.cpattern_2.equals(x.cpattern_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.cpattern_1.hashCode())+this.cpattern_2.hashCode();
  }


}
