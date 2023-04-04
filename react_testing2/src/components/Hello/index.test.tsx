import { render} from '@testing-library/react';
import { Hello } from '.';

describe('App', () => {
  it('renders App component', () => {
    render(<Hello />);
  });
});