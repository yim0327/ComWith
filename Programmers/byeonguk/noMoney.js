const solution = (price, money, count) => {
  let pay = 0;
  for (let i = 1; i <= count; i++) {
      pay += price * i;
  }
  return (pay <= money) ? 0 : pay-money;
}