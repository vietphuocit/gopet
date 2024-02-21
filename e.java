import java.util.Vector;

public final class e extends fs {
   public int a;
   private fz a;
   int b;
   private int c;

   public e(String var1) {
      super(true);
      this.d = var1;
      this.c = "BOARDLIST";
      this.n = j.e;
      this.l = new gq(1000, c.a(189), this);
   }

   public final void a() {
      bc.a.setColor(2425856);
      bc.a.fillRect(0, 0, bc.b, bc.c);
   }

   public final void a(Vector var1) {
      this.b.b(this.a);
      int var2 = var1.size();
      this.b = Math.max(v.h.getHeight(), v.h.getWidth()) + (gg.p << 1);
      this.a = new f(this, 2, var1);
      this.a.a(0, gg.l, bc.b, bc.c - (gg.l << 1));
      this.a.j = true;
      this.a.l = true;
      this.a.y = gg.p;
      this.a.b = (this.a.t - 2 * this.a.y) / this.b;
      this.a.c = (this.a.t - 2 * this.a.y - this.b * this.a.b) / (this.a.b + 1);
      var2 /= this.a.b;
      if (var1.size() % this.a.b != 0) {
         ++var2;
      }

      this.a.a.a = this.a.b * this.b;
      this.a.a.b = var2 * this.b;
      this.b.a(this.a);
      this.a.d = new gq(5, c.a(231), var1, this);
      this.a = 0;
      this.c = (this.a.u / this.b + 2) * this.a.b;
      this.a.l();
   }

   public final void a(Object var1) {
      gq var2;
      switch((var2 = (gq)((Object[])var1)[0]).a) {
      case 5:
         eh var4 = (eh)((Vector)var2.a).elementAt(this.a);
         j.e_();
         eu.a(24, new int[]{j.a.b, var4.a, 100, ed.a(j.a.b)});
         return;
      case 1000:
         var2 = new gq(1001, c.a(337), this);
         j.a((String)c.a(189), (gq)var2, j.b, 1);
         return;
      case 1001:
         fm var3 = (fm)fs.a;
         j.e_();
         eu.a(24, new int[]{j.a.b, Integer.parseInt(var3.a(0)), eg.a.m, eg.a.n});
      default:
      }
   }

   static int a(e var0) {
      return var0.c;
   }
}
