package ch03.before;

public class SortSample {

    private final int[] _data;

    public SortSample(int[] data) {
        _data = data;
        System.arraycopy(data, 0, _data, 0, data.length);
    }

    public void sort() {
        for (int x = 0; x <_data.length - 1; x++) {
            int m = x;
            for (int j = x + 1; j < _data.length; j++) {
                if (_data[j] < _data[m]) {
                    m = j;
                }
            }

            int v = _data[m];
            _data[m] = _data[x];
            _data[x] = v;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");
        for (int i = 0; i < _data.length; i++) {
            builder.append(_data[i]);
            if (i < _data.length - 1) {
                builder.append(", ");
            }
        }

        builder.append(" ]");
        return builder.toString();
    }
}
