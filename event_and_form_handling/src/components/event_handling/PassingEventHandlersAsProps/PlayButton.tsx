import { Button } from "./Button";

export function PlayButton({ movieName }: { movieName: string }) {
  function handlePlayClick() {
    alert(`Playing ${movieName}!`);
  }

  return <Button onSmash={handlePlayClick}>Play "{movieName}"</Button>;
}
