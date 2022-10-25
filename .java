document.addEventListener('DomContentLoaded', navList());
document.addEventListener('DOMContentLoaded', navListStyle());

function navList() {
  const section = document.getElementsByTagName('section');
  for (const i = 0; i < section.length; i++) {
    const navLi = document.createElement('li');
    const link = document.createElement('a');
    const itemName = section[i].getAttribute('data-nav');
    const itemNameAttribute = itemName.replace(/\s/g, '').toLowerCase();
    link.innerText = itemName;
    link.setAttribute('href', #${itemNameAttribute});
    link.setAttribute('id', 'link_no' + (i + 1))
    navLi.appendChild(link);
    document.getElementById('navbar__list').appendChild(navLi);
    document.getElementById('link_no' + (i + 1)).addEventListener('click', function() {
      scroll(i + 1);
      sectionActivate(i + 1);
      navActivate(i + 1);
    }) 
  }
}

function scroll(secNum) {
  const section = document.getElementById('section' + secNum);
  const position = section.offsetTop;
  event.preventDefault();
  window.scrollTo({
    left: 0,
    top: position,
    behavior: 'smooth'
  })
}

function navListStyle () {
  const link = document.getElementsByTagName('a');
  const styles = 
    display: flex;
    color: #000;
    flex-direction: row;
    padding: 0.5em;
    background-color: rgb(220, 220, 220);

for (i = 0; i < navBarItem.length; i++) {
    navBarItem[i].setAttribute('style', styles);
  }
  mouseTouch();
};

function mouseTouch () {
  const navBarItem = document.getElementsByTagName('a');
  for (i = 0; i < navBarItem.length; i++) {
    navBarItem[i].addEventListener('mouseenter', function (event) {
      event.target.style.backgroundColor = "rgb(0 , 0 , 0)";
      event.target.style.color = "#fff";
    })
    if (navBarItem[i].style.backgroundColor == "rgb(47, 0, 255)") {
      navBarItem[i].addEventListener('mouseout', function (event) {
        event.target.style.backgroundColor = "rgb(220, 220, 220)";
        event.target.style.color = "#000";
      })
    }
  }
}

function sectionActivate(secNum) {
  const isActive = 'your-active-class';
  const activeSections = document.getElementsByClassName(isActive)[0];
  const newactiveSections = document.getElementById('section' + secNum);
  activeSections.removeAttribute('class');
  newactiveSections.setAttribute('class', isActive);
}

function navActivate(secNum) {
  const navActive = document.getElementById('link_no' + secNum);
  const othersNavs = document.getElementsByTagName('a');
  for (i = 0; i <othersNavs.length; i++) {
    if (othersNavs[i].style.backgroundColor == "rgb(0, 0, 0)") {
      navy = othersNavs[i];
      navy.style.backgroundColor = "rgb(220, 220, 220)";
      navy.style.color = "#000";
    }
  }
  navActive.style.backgroundColor = "rgb(0, 0, 0)";
  navActive.style.color = "#fff";
}
