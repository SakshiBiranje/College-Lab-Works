package MyMath;

public class Stat {
    private float[] data;

    public Stat(float[] data) {
        this.data = data;
    }

    public float min() {
        float min = data[0];
        for (float num : data) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public float max() {
        float max = data[0];
        for (float num : data) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int count() {
        return data.length;
    }

    public float sum() {
        float sum = 0;
        for (float num : data) {
            sum += num;
        }
        return sum;
    }

    public float average() {
        return sum() / count();
    }
}
