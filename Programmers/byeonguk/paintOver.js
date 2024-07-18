const solution = (n, m, section) => {
  let count = 0;
  let i = 0;

  while (i < section.length) {
      count++;  //  롤러 사용
      let rollerEnd = section[i] + m - 1;  //  현재 섹션에서 롤러를 사용한 끝 지점

      //  롤러가 커버할 수 있는 다음 섹션
      while (i < section.length && section[i] <= rollerEnd) {
          i++;
      }
  }

  return count;
}