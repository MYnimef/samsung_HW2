import java.util.Locale;

public class Task {
    public static class Vector2D {
        public double vX, vY;
        public static int count = 0;

        Vector2D() {
            vX = 1;
            vY = 1;
            count++;
        }

        Vector2D(double vX, double vY) {
            this.vX = vX;
            this.vY = vY;
            count++;
        }

        Vector2D(Vector2D obj) {
            vX = obj.vX;
            vY = obj.vY;
            count++;
        }

        public void print() {
            System.out.println(String.format(Locale.US, "(%.2f, %.2f)", vX, vY));
        }

        public double length() {
            return Math.sqrt(Math.pow(vX, 2) + Math.pow(vY, 2));
        }

        public void add(Vector2D v) {
            vX += v.vX;
            vY += v.vY;
        }

        public void sub(Vector2D v) {
            vX -= v.vX;
            vY -= v.vY;
        }

        public void scale(double scaleFactor) {
            vX *= scaleFactor;
            vY *= scaleFactor;
        }

        public void normalized() {
            double len = length();
            vX /= len;
            vY /= len;
        }

        public double dotProduct(Vector2D v) {
            return vX * v.vX + vY * v.vY;
        }
    }

    public static void main(String[] args) {
        /*
        //Напишите класс Vector2D (вектор на плоскости).
        //В классе необходимо предусмотреть:
        //Два публичных дробных поля (double) vX и vY - значения проекций вектора на оси.
        //Конструктор без параметров, который инициализирует вектор значениями (1,1).
        //Конструктор с двумя параметрами (проекция на ось X, проекция на ось Y).
        //Конструктор с параметром Vector2D (такие конструкторы в литературе принято называть конструкторами копирования).
        //Метод print(), который выводит вектор на экран в виде: (vX, vY),
        //при этом значения проекций округлить до двух знаков после запятой.
        //Разделитель в дробных числах - точка. Например, при печати вектора с проекциями
        //vX = 1.2374 и vY = 2.2334, на экране должно появиться (1.24, 2.23).
        Vector2D v = new Vector2D(1.2374, 2.2334);
        Vector2D v2 = new Vector2D();
        Vector2D v3 = new Vector2D(v);
        v.print();
        v2.print();
        v3.print();

        //Необходимо дополнить класс из предыдущего задания следующими методами:
        //Метод вычисления длины вектора length().
        //Метод add(Vector2D v), прибавляющий вектор, указанный в аргументе, к текущему.
        //Метод sub(Vector2D v), вычитающий вектор, указанный в аргументе, из текущего.
        //Метод scale(double scaleFactor), умножающий текущий вектор на scaleFactor.
        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(1.0, 3.0);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(2);
        vC.print();
        */
        //Необходимо дополнить класс из предыдущего задания следующим:
        //Метод normalized(), нормализующий текущий вектор.
        //Нормализация вектора — это преобразование заданного вектора в вектор в том же направлении,
        //но с единичной длиной.
        //Метод dotProduct(Vector2D v), возвращающий скалярное произведение вектора,
        //указанного в аргументе, и текущего вектора.
        //Скалярным произведением двух векторов a и b будет скалярная величина,
        //равная сумме попарного произведения координат векторов a и b.
        //Статическое поле count для подсчета количества созданных векторов.
        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(5.0, 7.0);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(1.5);
        vC.print();
        vC.normalized();
        System.out.println(vC.length());
        vC.scale(2);
        System.out.println(vA.dotProduct(vB));
        System.out.println(vA.count);
    }
}
