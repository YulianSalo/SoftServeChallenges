function SimpleAdding(num) {
    return (num != 1) ? num + SimpleAdding(num - 1) : 1;
}

alert(SimpleAdding(4));