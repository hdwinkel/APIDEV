import { AngApiAppPage } from './app.po';

describe('ang-api-app App', function() {
  let page: AngApiAppPage;

  beforeEach(() => {
    page = new AngApiAppPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
