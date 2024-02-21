import java.util.Hashtable;
import java.util.Vector;

public final class cg extends fs {
   private final int a;
   private final Vector a = new Vector();
   private final Hashtable a = new Hashtable();
   private final String a;
   private fz a;
   private int b = 0;

   public cg(int var1, String var2) {
      super(true);
      this.e = true;
      this.a = v.c();
      this.a = var1;
      this.a = var2;
      this.h();
   }

   public final void h() {
      this.a.removeAllElements();
      this.a.clear();
      this.a = new fz();
      this.a.a(15, 45, bc.b - 30, bc.c - gg.n - 3 - 45);
      this.a.j = true;
      this.a.l = true;
      this.b = 0;
   }

   public final void i() {
      this.a.c = 0;
      this.b.a(this.a);
      this.a.c(1);
      this.a.c(true);
      this.a.a(true, 0, 1);
   }

   public final cj a(boolean var1, String var2, int var3, boolean var4, int var5, int var6) {
      cj var8;
      (var8 = new cj(this)).a = 1;
      var8.a = var2;
      var8.b = (byte)var3;
      var8.a = var4;
      this.a.addElement(var8);
      var8.c(bc.b - 30, 4);
      this.a.a(var8);
      var8.b(0, this.b);
      this.b += var8.u + 5;
      var8.h = var1;
      var8.a = var5;
      var8.b = var6;
      return var8;
   }

   public final void a(boolean var1, String var2, int var3, int var4) {
      ck var5;
      (var5 = new ck(this)).a = 0;
      var5.c = (byte)var4;
      var5.b = (byte)var3;
      var5.a = var2;
      var5.a = v.a(var5.c).a(var2, bc.b - 30);
      this.a.addElement(var5);
      var5.c(bc.b - 30, var5.a.length * v.a(var5.c).a() + 4);
      this.a.a(var5);
      var5.b(0, this.b);
      this.b += var5.u + 5;
      var5.h = var1;
   }

   public final void a(int var1, int var2, String var3, boolean var4, boolean var5) {
      ch var6;
      if ((var6 = (ch)this.a.get(new Integer(var1))) == null) {
         var6 = new ch(this);
         this.a.put(new Integer(var1), var6);
      }

      ch.a(var6)[var2] = var4;
      ch.b(var6)[var2] = var5;
      if (var1 == -1) {
         switch(var2) {
         case 0:
            this.l = new gq(0, var3, new Integer(var1), this);
            break;
         case 1:
            this.m = new gq(1, var3, new Integer(var1), this);
            break;
         case 2:
            this.n = new gq(2, var3, new Integer(var1), this);
         default:
            return;
         }
      } else {
         ci var7 = (ci)this.a.elementAt(var1);
         switch(var2) {
         case 0:
            var7.c = new gq(0, var3, new Integer(var1), this);
            return;
         case 1:
            var7.d = new gq(1, var3, new Integer(var1), this);
            return;
         case 2:
            var7.e = new gq(2, var3, new Integer(var1), this);
         }
      }

   }

   public final void a(Object var1) {
      gq var7;
      Integer var2 = (Integer)(var7 = (gq)((Object[])var1)[0]).a;
      ch var3 = (ch)this.a.get(var2);
      boolean var4 = false;
      boolean var5 = false;
      int var6 = var7.a;
      if (var3 != null) {
         var4 = ch.a(var3)[var6];
         var5 = ch.b(var3)[var6];
      }

      int var10;
      if (var4) {
         for(var10 = 0; var10 < this.a.size(); ++var10) {
            ci var11;
            if ((var11 = (ci)this.a.elementAt(var10)).a == 1) {
               br.a.a(((cj)var11).a);
            }
         }

         this.a((fs)null);
      }

      if (var5) {
         int var10000 = var7.a;
         int var10001 = this.a;
         var10 = var2;
         int var9 = var10001;
         int var8 = var10000;
         ez var12;
         (var12 = new ez(81)).a(100);
         var12.b(var9);
         var12.b(var10);
         var12.b(var8);
         eu.a.a(var12);
         var12.a();
         j.e_();
      }

   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
      br.a.a();
      gg.b(10, 20, bc.b - 20, 22);
      v.c().a(bc.a, this.a, bc.d, 22, 17);
      gg.b(10, 42, bc.b - 20, bc.c - gg.n - 42);
   }

   static fz a(cg var0) {
      return var0.a;
   }
}
