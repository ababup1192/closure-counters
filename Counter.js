const createCounter = () => {
    let count = 0;

    return () => {
        count += 1;
        return count;
    }
}

const counter = createCounter();

Array.from({length: 10}, () =>
    console.log(counter())
)
