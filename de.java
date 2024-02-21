import javax.microedition.lcdui.Image;

final class de extends da {
   private final dd a;

   public de(dd var1, int var2) {
      super((Image)null);
      this.a = var1;
      this.c = (byte)var2;
   }

   public final void a() {
      bc.a.translate(this.r, this.s);
      bc.a.setColor(gg.b);
      bc.a.fillRoundRect(0, 0, this.t, this.u, 10, 10);
      label17:
      switch(this.a.b) {
      case 0:
         switch(this.c) {
         case 0:
            gj.a.a(bc.a, "(str) Luyện sức mạnh", 2, 2, 20);
            break label17;
         case 1:
            gj.a.a(bc.a, "(agi) Luyện tốc độ", 2, 2, 20);
            break label17;
         case 2:
            gj.a.a(bc.a, "(int) Luyện thông minh", 2, 2, 20);
         default:
            break label17;
         }
      case 1:
         if (this.c < this.a.a.a.length) {
            gj.a.a(bc.a, this.a.a.a[this.c], 2, 2, 20);
         }
      }

      bc.a.translate(-this.r, -this.s);
   }

   public final void a_() {
      super.a_();
      this.a.a = this.c;
      switch(this.a.b) {
      case 0:
         String var1 = "";
         switch(this.c) {
         case 0:
            var1 = var1 + "+" + this.a.a[this.c] + " (str) ";
            break;
         case 1:
            var1 = var1 + "+" + this.a.a[this.c] + " (agi) ";
            break;
         case 2:
            var1 = var1 + "+" + this.a.a[this.c] + " (int) ";
         }

         var1 = var1 + "-" + this.a.b[this.c] + " (ngoc) -" + this.a.a[this.c] + " (vang)\n";
         var1 = var1 + dd.a(this.a);
         this.a.a = gj.a.a(var1, bc.b - 25);
         return;
      case 1:
         if (this.c < this.a.a.a.length) {
            this.a.a = gj.a.a(this.a.a.b[this.c], bc.b - 25);
         }
      default:
      }
   }
}
