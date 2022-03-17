const puppeteer = require('puppeteer');
(async () => {
    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    try{
    await page.goto('https://8081-fccbbecfdcdbbfaeaadbeadeeecccc.examlyiopb.examly.io/');
    await page.setViewport({
      width:1200,
      height:800,
    })
      await page.click('#signupLink');
      await page.waitForNavigation();
      await page.type('#email', 'test@gmail.com');
      await page.type('#username', 'testuser');
      await page.type('#mobileNumber', '9876543210');
      await page.type('#password', 'Test@123');
      await page.type('#confirmPassword', 'Test@123');
      await page.click('#submitButton');
      await page.waitForNavigation();
      await page.waitForSelector('#loginBox',{timeout:3000});
      console.log('TESTCASE:FE_Signup:success');
    }
     catch(e){
      console.log('TESTCASE:FE_Signup:failure');
    }finally{
      await page.close();
      await browser.close();
    }
    
})();

 

(async () => {
    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    try{
    await page.goto('https://8081-fccbbecfdcdbbfaeaadbeadeeecccc.examlyiopb.examly.io/');
    await page.setViewport({
      width:1200,
      height:800,
    })
      await page.type('#email', 'test@gmail.com');
      await page.type('#password', 'Test@123');
      await page.click('#loginButton');
      await page.waitForNavigation();
      await page.waitForSelector('#userHome',{timeout:3000});
      console.log('TESTCASE:FE_login:success');
    }
     catch(e){
      console.log('TESTCASE:FE_login:failure');
    }finally{
      await page.close();
      await browser.close();
    }
    
})();

 

(async () => {
    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    try{
    await page.goto('https://8081-fccbbecfdcdbbfaeaadbeadeeecccc.examlyiopb.examly.io/');
    await page.setViewport({
      width:1200,
      height:800,
    })
    await page.type('#email', 'test@gmail.com');
    await page.type('#password', 'Test@123');
    await page.click('#loginButton');
      await page.waitForNavigation();
      await page.waitForSelector('#userHome',{timeout:3000});
      await page.click('#grid1');
      await page.waitForSelector('#submitButton',{timeout:3000});
      await page.click('#casePrescriptionButton');
      await page.waitForSelector('#userPrescription',{timeout:3000});
      console.log('TESTCASE:FE_userOperation1:success');
    }
     catch(e){
      console.log('TESTCASE:FE_userOperation1:failure');
    }finally{
      await page.close();
      await browser.close();
    }
    
})();

(async () => {
  const browser = await puppeteer.launch();
  const page = await browser.newPage();
  try{
  await page.goto('https://8081-fccbbecfdcdbbfaeaadbeadeeecccc.examlyiopb.examly.io/');
  await page.setViewport({
    width:1200,
    height:800,
  })
  await page.type('#email', 'test@gmail.com');
  await page.type('#password', 'Test@123');
  await page.click('#loginButton');
    await page.waitForNavigation();
    await page.waitForSelector('#userHome',{timeout:3000});
    await page.click('#reportButton');
    await page.waitForSelector('#userReport',{timeout:3000});
    await page.click('#logoutButton');
    await page.waitForSelector('#loginBox',{timeout:3000});
    console.log('TESTCASE:FE_userOperation2:success');
  }
   catch(e){
    console.log('TESTCASE:FE_userOperation2:failure');
  }finally{
    await page.close();
    await browser.close();
  }
  
})();